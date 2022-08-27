package Schooling;

public class SEGClass {
    private String classNum;
    private String className;
    private int classSize;

    public SEGClass(String classNum, String className, int classSize){
        this.classNum = classNum;
        this.className = className;
        this.classSize = classSize;
    }
    public String getclassNum() {
        return classNum;
    }
    public void setclassNum(String classNum) {
        this.classNum = classNum;
    }
    public int getClassSize() {
        return classSize;
    }
    public String getTicker() {
        return className;
    }
}