public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    double verbalPercentage;

    public Course(String name, String code, String prefix, double verbalPercentage) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalPercentage = verbalPercentage;
    }

    public double getVerbalAverage() {
        return this.note * this.verbalPercentage / 100.0;

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}