package ch09;

public class SubjectTest {
    public static void main(String[] args) {
        Student studentLee = new Student(1202, "Lee");
        studentLee.setKoreaSubject("국어", 92);
        studentLee.setMathSubject("수학", 89);

        Student studentKim = new Student(1202, "Kim");
        studentKim.setKoreaSubject("국어", 72);
        studentKim.setMathSubject("수학", 86);

        studentLee.showScoreInfo();
        studentKim.showScoreInfo();
    }
}
