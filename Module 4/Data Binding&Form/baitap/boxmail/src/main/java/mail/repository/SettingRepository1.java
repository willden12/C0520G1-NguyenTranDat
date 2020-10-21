package mail.repository;

import mail.model.Setting1;

import java.util.List;

public interface SettingRepository1 {
    Setting1 getSetting();

    void edit(Setting1 setting);

    List<String> getLanguageList();

    List<Integer> getPageSizeList();
}
