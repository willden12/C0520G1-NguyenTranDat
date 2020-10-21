package mail.service;

import mail.model.Setting1;
import mail.repository.SettingRepository1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import mail.repository.SettingRepository;

import java.util.List;

@Service
public class SettingServiceImpl implements SettingService {
    @Autowired
    private SettingRepository1 settingRepository;

    @Override
    public Object getSetting() {
        return settingRepository.getSetting();
    }

    @Override
    public void edit(Setting1 setting) {
        settingRepository.edit(setting);
    }

    @Override
    public List<String> getLanguageList() {
        return settingRepository.getLanguageList();
    }

    @Override
    public List<Integer> getPageSizeList() {
        return settingRepository.getPageSizeList();
    }
}
