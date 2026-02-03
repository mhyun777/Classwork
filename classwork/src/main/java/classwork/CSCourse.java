package classwork;

public class CSCourse extends Course {
    public static Department department = Department.CMSC;
    public static enum Language {PYTHON, JAVA, C};
    
    private Language[] coveredLanguages;

    public CSCourse(String name, College college, int number, Language[] coveredLanguages) {
        super(name, Department.CMSC, college, number);
        this.coveredLanguages = coveredLanguages;
    }

    public void setCoveredLanguages(Language[] coveredLanguages) {
        this.coveredLanguages = coveredLanguages;
    }
    public Language[] getCoveredLanguages() {
        return coveredLanguages;
    }

    @Override
    public String toString() {
        String output = super.toString();
        if(coveredLanguages.length > 0) output += ", covers languages:";
        for(int i = 0; i < coveredLanguages.length; i++) {
            String lang = coveredLanguages[i].toString();
            output += " " + lang.substring(0,1) + lang.substring(1).toLowerCase();
        }
        return output;
    }
}
