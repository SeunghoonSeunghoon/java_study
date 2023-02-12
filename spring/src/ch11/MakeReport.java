package ch11;

public class MakeReport {
    StringBuffer buffer = new StringBuffer();

    private String line = "======================================\n";
    private String title = "이름\t   주소\t\t  전화번호   \n";
    private void makeHeader()
    {
        buffer.append(line);
        buffer.append(title);
        buffer.append(line);
    }

    private void generateBody()
    {
        buffer.append("Ja mes \t");
        buffer.append("Seoul Korea \t");
        buffer.append("010-123-1232\n ");

        buffer.append("Tomas \t");
        buffer.append("NewYork US \t");
        buffer.append("010-1231-1231\n");
    }

    private void makeFooter()
    {
        buffer.append(line);
    }
    public String getReport()
    {
        makeHeader();
        generateBody();
        makeFooter();
        return buffer.toString();
    }
}
