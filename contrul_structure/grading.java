class Scoring {
    public static void main(String[] args) {

        int marks = 75;
        String grade;

        // if-else
        if (marks >= 70) grade = "B";
        else grade = "C";

        // switch
        switch (grade) {
            case "B": System.out.println("Good"); break;
            case "C": System.out.println("Fair"); break;
        }
    }
}