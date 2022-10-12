package week4.DB;

import java.util.List;

public class ParserForHospital implements ParseAccordingly<Hospital>{

    @Override
    public Hospital parse(String toParse) {
        String[] info = toParse.split(",");
        return new Hospital(info[0], info[1], info[2], info[6], info[10]);
    }


}
