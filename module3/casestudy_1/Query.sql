use furuma_resort;


-- YÊU CẦU 2 (Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự.)

select ho_ten
from nhan_vien
where ho_ten like 'T%' 
	or ho_ten like 'H%' 
	or ho_ten like 'K%';

-- YÊU CẦU 3 (Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.)

select id_khach_hang, ho_ten, ngay_sinh, so_cmnd, sdt, email, dia_chi 
from khach_hang
where (year(now())- year(ngay_sinh))>18 and	
		(year(now())- year(ngay_sinh))<50
	and (dia_chi = 'Da Nang'or dia_chi = 'Quang Tri');

-- YÊU CẦU 4 (Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. 
-- Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.)

select *, count(*) as so_lan_dat
from khach_hang
	left join hop_dong on hop_dong.id_khach_hang = khach_hang.id_khach_hang
	left join loai_khach on loai_khach.id_loai_khach = khach_hang.id_loai_khach
    where loai_khach.ten_loai_khach = 'Diamond'
    group by ho_ten
    order by so_lan_dat;


-- YÊU CẦU 5  (	Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, TongTien 
-- (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem) 
-- cho tất cả các Khách hàng đã từng đặt phỏng. 
-- (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra)..)


SELECT khach_hang.id_khach_hang, khach_hang.ho_ten, loai_khach.ten_loai_khach, hop_dong.id_hop_dong,dich_vu.ten_dich_vu, hop_dong.ngay_lam_hop_dong, hop_dong.ngay_ket_thuc_hop_dong, dich_vu.chi_phi_thue + (dich_vu_di_kem.don_vi*dich_vu_di_kem.gia) AS 'Tổng Tiền'
FROM khach_hang
	LEFT JOIN hop_dong ON khach_hang.id_khach_hang = hop_dong.id_khach_hang
	LEFT JOIN loai_khach ON loai_khach.id_loai_khach = khach_hang.id_loai_khach
	LEFT JOIN dich_vu ON dich_vu.id_dich_vu = hop_dong.id_dich_vu
	LEFT JOIN hop_dong_chi_tiet ON hop_dong_chi_tiet.id_hop_dong = hop_dong.id_hop_dong
	LEFT JOIN dich_vu_di_kem ON dich_vu_di_kem.id_dich_vu_di_kem = hop_dong_chi_tiet.id_dich_vu_di_kem;


-- YÊU CẦU 6 	Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu của tất cả các loại Dịch vụ chưa từng được 
-- Khách hàng thực hiện đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).
select dich_vu.id_dich_vu, dich_vu.ten_dich_vu, dich_vu.dien_tich, dich_vu.chi_phi_thue, loai_dich_vu.ten_loai_dich_vu, hop_dong.ngay_lam_hop_dong
from dich_vu
	inner join loai_dich_vu on loai_dich_vu.id_loai_dich_vu = dich_vu.id_loai_dich_vu
	left join hop_dong on hop_dong.id_dich_vu = dich_vu.id_dich_vu
where (datediff(hop_dong.ngay_lam_hop_dong, '2019-01-01')<0) or (datediff(hop_dong.ngay_lam_hop_dong, '2019-03-31')>0);


-- YÊU CẦU 7. Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu 
-- của tất cả các loại dịch vụ đã từng được Khách hàng đặt phòng trong năm 2018 
-- nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019.

select dich_vu.id_dich_vu, dich_vu.ten_dich_vu, dich_vu.dien_tich, dich_vu.so_nguoi_toi_da, dich_vu.chi_phi_thue, loai_dich_vu.ten_loai_dich_vu
from dich_vu
	left join loai_dich_vu on loai_dich_vu.id_loai_dich_vu = dich_vu.id_loai_dich_vu
	left join hop_dong on hop_dong.id_dich_vu = dich_vu.id_dich_vu
where (hop_dong.ngay_lam_hop_dong between '2018-01-01' and '2018-12-31') and hop_dong.id_dich_vu not in(
select hop_dong.id_dich_vu 
from hop_dong 
where (hop_dong.ngay_lam_hop_dong between '2019-01-01' and '2019-12-31')
);

-- YÊU CẦU 8.Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên

-- CÁCH 1
-- select distinct khach_hang.ho_ten
-- from khach_hang;
-- CÁCH 2
-- select khach_hang.ho_ten
-- from khach_hang
-- group by khach_hang.ho_ten
-- having count(ho_ten)>=1;
-- -- CÁCH 3
select khach_hang.ho_ten
from khach_hang
union
select khach_hang.ho_ten
from khach_hang;

--  YÊU CẦU 9.	Thực hiện thống kê doanh thu theo tháng, 
-- nghĩa là tương ứng với mỗi tháng trong năm 2019 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.

select month(hop_dong.ngay_lam_hop_dong) as tháng, count(hop_dong.id_hop_dong) as 'số lượng', sum(hop_dong.tong_tien) as 'doanh thu'
from hop_dong
where year(hop_dong.ngay_lam_hop_dong) = '2019'
group by hop_dong.id_khach_hang;

-- YÊU CẦU 10.	Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm.
--  Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem 
-- (được tính dựa trên việc count các IDHopDongChiTiet).

select hop_dong.id_hop_dong, hop_dong.ngay_lam_hop_dong, hop_dong.ngay_ket_thuc_hop_dong, hop_dong.tien_dat_coc, count(hop_dong_chi_tiet.id_dich_vu_di_kem) as 'SoLuongDichVuDiKem'
from hop_dong
	join hop_dong_chi_tiet on hop_dong_chi_tiet.id_hop_dong = hop_dong.id_hop_dong
group by hop_dong.id_hop_dong;


-- YÊU CẦU 11.	Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng có TenLoaiKhachHang là “Diamond” 
-- và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.

select dich_vu_di_kem.id_dich_vu_di_kem, dich_vu_di_kem.ten_dich_vu_di_kem, dich_vu_di_kem.gia, dich_vu_di_kem.don_vi, dich_vu_di_kem.trang_thai_kha_dung, khach_hang.ho_ten
from dich_vu_di_kem
	join hop_dong_chi_tiet on dich_vu_di_kem.id_dich_vu_di_kem = hop_dong_chi_tiet.id_dich_vu_di_kem
	join hop_dong on hop_dong_chi_tiet.id_hop_dong = hop_dong.id_hop_dong
	join khach_hang on khach_hang.id_khach_hang = hop_dong.id_khach_hang
	join loai_khach on loai_khach.id_loai_khach = khach_hang.id_loai_khach
where loai_khach.ten_loai_khach  = 'Diamond' and (khach_hang.dia_chi = 'Vinh' or khach_hang.dia_chi = 'Quang Ngai') 
group by khach_hang.ho_ten;


-- YÊU CẦU 12.	Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu, SoLuongDichVuDikem 
-- (được tính dựa trên tổng Hợp đồng chi tiết), TienDatCoc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2019 
-- nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.

select hop_dong.id_hop_dong, nhan_vien.ho_ten, khach_hang.ho_ten, khach_hang.sdt, dich_vu.ten_dich_vu, hop_dong.ngay_lam_hop_dong, count(hop_dong_chi_tiet.id_dich_vu_di_kem) as SoLuongDichVuDikem
from hop_dong
	left join nhan_vien on nhan_vien.id_nhan_vien = hop_dong.id_nhan_vien
	left join khach_hang on khach_hang.id_khach_hang = hop_dong.id_khach_hang
	left join dich_vu on dich_vu.id_dich_vu = hop_dong.id_dich_vu
	left join hop_dong_chi_tiet on hop_dong_chi_tiet.id_hop_dong = hop_dong.id_hop_dong
where (hop_dong.ngay_lam_hop_dong between '2019-10-01' and '2019-12-31') and (hop_dong.ngay_lam_hop_dong not between '2019-01-01' and '2019-06-31')
group by hop_dong.id_hop_dong;


-- YÊU CẦU 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. 
-- (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).

create view max
as
select dich_vu_di_kem.ten_dich_vu_di_kem, count(dich_vu_di_kem.id_dich_vu_di_kem) as 'so_luong_lon_nhat'
from hop_dong
left join hop_dong_chi_tiet on hop_dong_chi_tiet.id_hop_dong = hop_dong.id_hop_dong
left join dich_vu_di_kem on dich_vu_di_kem.id_dich_vu_di_kem = hop_dong_chi_tiet.id_dich_vu_di_kem
group by dich_vu_di_kem.ten_dich_vu_di_kem
having count(dich_vu_di_kem.id_dich_vu_di_kem)
order by count(dich_vu_di_kem.id_dich_vu_di_kem) desc;

select *
from max
group by ten_dich_vu_di_kem
having so_luong_lon_nhat = (select max(so_luong_lon_nhat) from max);


-- YÊU CẦU 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất.
--  Thông tin hiển thị bao gồm IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung.

select hop_dong.id_hop_dong, loai_dich_vu.ten_loai_dich_vu, dich_vu_di_kem.ten_dich_vu_di_kem, count(dich_vu_di_kem.ten_dich_vu_di_kem) as SoLuong
from hop_dong 
join dich_vu on dich_vu.id_dich_vu = hop_dong.id_dich_vu
join loai_dich_vu on loai_dich_vu.id_loai_dich_vu = dich_vu.id_loai_dich_vu
join hop_dong_chi_tiet on hop_dong_chi_tiet.id_hop_dong = hop_dong.id_hop_dong
join dich_vu_di_kem on dich_vu_di_kem.id_dich_vu_di_kem = hop_dong_chi_tiet.id_dich_vu_di_kem
group by dich_vu_di_kem.ten_dich_vu_di_kem
having count(dich_vu_di_kem.ten_dich_vu_di_kem) = 1;

-- YÊU CẦU 15.	Hiển thi thông tin của tất cả nhân viên bao gồm 
-- IDNhanVien, HoTen, TrinhDo, TenBoPhan, SoDienThoai, DiaChi 
-- mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019.

select nhan_vien.id_nhan_vien, nhan_vien.ho_ten, bo_phan.ten_bo_phan, nhan_vien.sdt, nhan_vien.dia_chi, count(hop_dong.id_nhan_vien)
from nhan_vien 
join trinh_do on trinh_do.id_trinh_do = nhan_vien.id_trinh_do
join bo_phan on bo_phan.id_bo_phan = nhan_vien.id_bo_phan
join hop_dong on hop_dong.id_nhan_vien = nhan_vien.id_nhan_vien
where year(hop_dong.ngay_lam_hop_dong) in (2018, 2019)
group by nhan_vien.id_nhan_vien
having count(hop_dong.id_nhan_vien) <= 3;

-- YÊU CẦU 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 đến năm 2019.

SET FOREIGN_KEY_CHECKS = 0;
DELETE FROM nhan_vien
WHERE nhan_vien.id_nhan_vien NOT IN (
	SELECT id_nhan_vien
	FROM (
		SELECT nhan_vien.id_nhan_vien 
		FROM nhan_vien 
			JOIN hop_dong ON hop_dong.id_nhan_vien = nhan_vien.id_nhan_vien
		WHERE YEAR(hop_dong.ngay_lam_hop_dong) IN (2017, 2019)) AS abc
);
SET FOREIGN_KEY_CHECKS = 1;

-- YÊU CẦU 17.	Cập nhật thông tin những khách hàng có TenLoaiKhachHang từ  Platinium lên Diamond,
--  chỉ cập nhật những khách hàng đã từng đặt phòng với tổng Tiền thanh toán trong năm 2019 là lớn hơn 10.000.000 VNĐ.

UPDATE khach_hang
SET khach_hang.id_loai_khach = 1
WHERE id_khach_hang IN (
	SELECT * FROM (SELECT khach_hang.id_khach_hang FROM khach_hang
		JOIN hop_dong ON hop_dong.id_khach_hang = khach_hang.id_khach_hang
	WHERE YEAR(hop_dong.ngay_lam_hop_dong) = 2019 AND hop_dong.tong_tien >= 10000000 AND khach_hang.id_loai_khach = 2 ) AS abc
    );

-- YÊU CẦU 18.	Xóa những khách hàng có hợp đồng trước năm 2016 (chú ý ràng buộc giữa các bảng).

SET FOREIGN_KEY_CHECKS = 0;
DELETE FROM khach_hang
WHERE id_khach_hang IN (
	SELECT id_khach_hang
	FROM ( SELECT khach_hang.id_khach_hang FROM khach_hang
		JOIN hop_dong ON hop_dong.id_khach_hang = khach_hang.id_khach_hang
	WHERE YEAR(hop_dong.ngay_lam_hop_dong) < 2016) AS abc
);
SET FOREIGN_KEY_CHECKS = 1;

-- YÊU CẦU 19.	Cập nhật giá cho các Dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2019 lên gấp đôi.

UPDATE dich_vu_di_kem
JOIN hop_dong_chi_tiet ON hop_dong_chi_tiet.id_dich_vu_di_kem = dich_vu_di_kem.id_dich_vu_di_kem
SET dich_vu_di_kem.gia = dich_vu_di_kem.gia * 2
WHERE dich_vu_di_kem.gia IN (
	SELECT abc.gia
	FROM(SELECT dich_vu_di_kem.gia, dich_vu_di_kem.id_dich_vu_di_kem 
		 FROM dich_vu_di_kem
			 JOIN hop_dong_chi_tiet ON hop_dong_chi_tiet.id_dich_vu_di_kem = dich_vu_di_kem.id_dich_vu_di_kem
		 GROUP BY dich_vu_di_kem.id_dich_vu_di_kem
		 HAVING SUM(hop_dong_chi_tiet.so_luong) > 10 ) AS abc
);

-- YÊU CẦU 20.	Hiển thị thông tin của tất cả các Nhân viên và Khách hàng có trong hệ thống,
-- thông tin hiển thị bao gồm ID (IDNhanVien, IDKhachHang), HoTen, Email, SoDienThoai, NgaySinh, DiaChi.

SELECT nhan_vien.id_nhan_vien AS 'id', nhan_vien.ho_ten AS 'ho_ten', nhan_vien.email, nhan_vien.sdt, nhan_vien.ngay_sinh, nhan_vien.dia_chi, 'nhân viên' AS 'phan_loai'
FROM nhan_vien
UNION
SELECT khach_hang.id_khach_hang, khach_hang.ho_ten, khach_hang.email, khach_hang.sdt, khach_hang.ngay_sinh, khach_hang.dia_chi, 'khách hàng'
FROM khach_hang;













