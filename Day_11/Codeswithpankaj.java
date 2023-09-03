public class Codeswithpankaj {
    // Instance variables
    private String courseName;
    private int courseDuration;

    // Constructor with two parameters
    public Codeswithpankaj(String name, int duration) {
        courseName = name;
        courseDuration = duration;
    }

    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Duration (in weeks): " + courseDuration);
    }

    public static void main(String[] args) {
        // Create an object using the constructor
        Codeswithpankaj course = new Codeswithpankaj("Java Programming", 12);

        // Call the displayCourseDetails method to show the course details
        course.displayCourseDetails();
    }
}
