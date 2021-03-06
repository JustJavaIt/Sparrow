package visitorpattern;

/**
 * 全职员工
 *
 * @author Sparrow
 * @description ConcreteElement（具体元素）
 * @description 具体元素实现了Accept方法，在Accept方法中调用访问者的访问方法以便完成一个元素的操作。
 */
public class FullTimeEmployee implements Employee {

    private String name;
    private double weeklyWage;
    private int workTime;

    public FullTimeEmployee(String name, double weeklyWage, int workTime) {
        this.name = name;
        this.weeklyWage = weeklyWage;
        this.workTime = workTime;
    }

    @Override
    public void accept(AbstractDepartment handler) {
        handler.visit(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeeklyWage() {
        return weeklyWage;
    }

    public void setWeeklyWage(double weeklyWage) {
        this.weeklyWage = weeklyWage;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }
}
