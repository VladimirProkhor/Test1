package lesson9Object;

public class Emploee implements Cloneable{
    String name;
    String jobTitle;
    int workExperience;
    int age;
    int id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Emploee emploee = (Emploee) o;

//        if (workExperience != emploee.workExperience) return false;
//        if (age != emploee.age) return false;
//        if (id != emploee.id) return false;
//        if (name != null ? !name.equals(emploee.name) : emploee.name != null) return false;
        return jobTitle != null ? jobTitle.equals(emploee.jobTitle) : emploee.jobTitle == null;
    }

    @Override
    public int hashCode() {
//        int result = name != null ? name.hashCode() : 0;
        //        result = 31 * result + workExperience;
//        result = 31 * result + age;
//        result = 31 * result + id;
        return (jobTitle != null ? jobTitle.hashCode() : 0);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Emploee(new String(this.name),new String(this.jobTitle),this.workExperience,this.age,this.id);
    }

    @Override
    public String toString() {
        return "Emploee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", workExperience=" + workExperience +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    public Emploee(String name, String jobTitle, int workExperience, int age, int id) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.workExperience = workExperience;
        this.age = age;
        this.id = id;
    }
}
