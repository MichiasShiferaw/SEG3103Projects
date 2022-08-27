package Schooling;

import java.util.List;

public class ClassReport {
    private ClassServices classService;
    private List<SEGClass> classess;

    public ClassServices getclassService() {
        return classService;
    }
    public void setclassService(ClassServices classService) {
        this.classService = classService;
    }
    public List<SEGClass> getClasses() {
        return classess;
    }
    public void setClasses(List<SEGClass> classess) {
        this.classess = classess;
    }
    public double getPassedStudents(){
        double projectPassingStudents = 0.0;
        for(SEGClass classes:classess){
            double val = classService.getClass(classes);
            if( val <0){
                val = 0;
            } else if (val>1) {
                val =1;
            }

            projectPassingStudents += val * classes.getClassSize();
        }
        return projectPassingStudents;
    }
}