public class PrintResult {
    static void print(int count, String name) {
        if (count != 0) {
            System.out.println(" ����� � ������ \"" + Main.wordToSearch + "\" ����������� � ������ " + count + " ���" +
                    " �������� �������� ������� " + name);
        } else {
            System.out.println(" ����� � ������ \"" + Main.wordToSearch + "\" ����������� � ������ " +
                    " �������� �������� ������� " + name);
        }
    }
}
