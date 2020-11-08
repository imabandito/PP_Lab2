package com.studentPackage;

public enum ListOfFaculties {
    COMPUTER_SCIENCE("Computer_science"),
    LAW("Law"),
    PHYSICS("Physics"),
    MATHEMATICS("Mahtematics"),
    NONE("None");

    private String text;
    ListOfFaculties(String text) {
        this.text = text;
    }

    public String getText(){
        return this.text;
    }

    public static ListOfFaculties stringToFaculty(String facultyStr){
        for (ListOfFaculties faculty:ListOfFaculties.values())
        {
            if(faculty.text.equalsIgnoreCase(facultyStr)){
                return faculty;
            }
        }
        return ListOfFaculties.NONE;
    }
}
