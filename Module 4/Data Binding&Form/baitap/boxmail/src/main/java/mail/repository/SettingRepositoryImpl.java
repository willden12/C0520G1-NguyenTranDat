package mail.repository;

import mail.model.Setting1;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class SettingRepositoryImpl implements SettingRepository1 {
    private static List<String> languageList;
    private static List<Integer> pageSizeList;
    private static Setting1 setting;

    static {
        languageList = new ArrayList<>();
        languageList.add("english");
        languageList.add("vietnamese");
        languageList.add("chinese");
        languageList.add("japanese");
        languageList.add("french");
        pageSizeList = new ArrayList<>();
        pageSizeList.add(5);
        pageSizeList.add(10);
        pageSizeList.add(15);
        pageSizeList.add(25);
        pageSizeList.add(50);
        pageSizeList.add(100);
        setting = new Setting1("English", 10, true, "Thanks");
    }

    @Override
    public Setting1 getSetting() {
        return setting;
    }

    @Override
    public void edit(Setting1 updateSetting) {
        setting.setLanguage(updateSetting.getLanguage());
        setting.setPageSize(updateSetting.getPageSize());
        setting.setFilter(updateSetting.getFilter());
        setting.setSignature(updateSetting.getSignature());
    }

    @Override
    public List<String> getLanguageList() {
        return languageList;
    }

    @Override
    public List<Integer> getPageSizeList() {
        return pageSizeList;
    }
}
