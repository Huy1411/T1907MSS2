import java.util.Scanner;

public class LoginLibrary {
    private String username;
    private String password;
    private String fullname;

    public LoginLibrary(String username, String password, String fullname) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    static void Login() {
        LoginLibrary acc1 = new LoginLibrary("Huy", "1411", "Nguyễn Xuân Huy");
        String username1 = acc1.getUsername();
        String password1 = acc1.getPassword();
        LoginLibrary acc2 = new LoginLibrary("Ha", "2203", "Hoàng Trọng Hà");
        String username2 = acc2.getUsername();
        String password2 = acc2.getPassword();
        LoginLibrary acc3 = new LoginLibrary("Dung", "2401", "Hoàng Thị Phương Dung");
        String username3 = acc3.getUsername();
        String password3 = acc3.getPassword();
        String guessUser, guessPass;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập UserName: ");
        guessUser = scanner.nextLine();
        System.out.println("Mời nhạp Password:");
        guessPass = scanner.nextLine();
        if (username1.equals(guessUser) && password1.equals(guessPass) || username2.equals(guessUser) && password2.equals(guessPass) || username3.equals(guessUser) && password3.equals(guessPass)) {
            System.out.printf("Đăng nhập thành công");
        } else {
            System.out.printf("Lỗi");
        }
    }
}
