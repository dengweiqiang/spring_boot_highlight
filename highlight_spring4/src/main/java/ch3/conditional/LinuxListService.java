package ch3.conditional;

/**
 * Created by dengweiqiang on 2020/1/14
 */
public class LinuxListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
