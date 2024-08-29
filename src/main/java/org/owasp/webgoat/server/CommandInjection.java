import java.io.*;
import javax.servlet.http.HttpServletRequest;

public class CommandInjection {
    public static Process runCmd(HttpServletRequest request) throws IOException {
        String filename = request.getParameter("filename");
        ProcessBuilder builder = new ProcessBuilder("cat", filename);
        Process process = builder.start();
        return(process);
    }
}
