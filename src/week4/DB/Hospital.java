package week4.DB;

public class Hospital {
    private String id;
    private String address;
    private String district;
    private String category;
    private String emergencyRoom;
    private String name;
    private String subdivision;

    public String clean(String str) {
        str.replaceAll("\'", "");
        return str;
    }
    public Hospital(String id, String address, String category, String emergencyRoom, String name) {
        this.id = clean(id);
        this.address = clean(address);
        this.category = clean(category);
        this.emergencyRoom = clean(emergencyRoom);
        this.name = clean(name);
        setDistrict();
        setSubdivision();
    }



    public void setDistrict() {
        String[] getDistrict = address.split("\\s+");
        this.district = getDistrict[0] + " " + getDistrict[1];
    }

    public void setSubdivision() {
        String[] divNames = {"피부과", "성형외과", "외과", "내과", "소아과", "가정의학과", "치과"};
        subdivision = null;
        for (String divName : divNames) {
           if (name.contains(divName)) subdivision = divName;
        }
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getDistrict() {
        return district;
    }

    public String getCategory() {
        return category;
    }

    public String getEmergencyRoom() {
        return emergencyRoom;
    }

    public String getName() {
        return name;
    }

    public String getSubdivision() {
        return subdivision;
    }
}
