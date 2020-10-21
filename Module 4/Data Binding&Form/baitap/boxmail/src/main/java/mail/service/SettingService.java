package mail.service;

import mail.model.Setting1;

import java.util.List;

public interface SettingService {
    Object getSetting();

    void edit(Setting1 setting);

    List<String> getLanguageList();

    List<Integer> getPageSizeList();
}
