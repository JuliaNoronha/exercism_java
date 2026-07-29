public class LogLevels {
    
    public static String message(String logLine) {
        String s1[] = logLine.split(":");
        String s2 = s1[1].trim();
        String message = s2;
        return message;        
    }

    public static String logLevel(String logLine) {
        String s1[] = logLine.split(":");
        String semColcheteEsquerdo = s1[0].replace("[", "");
        String semColchete = semColcheteEsquerdo.replace("]", "");
        String logLevel = semColchete.toLowerCase();
        return logLevel;
    }

    public static String reformat(String logLine) {
        String s1 = message(logLine);
        String s2 = logLevel(logLine);
        String reformat = (s1 + " (" + s2 + ")");
        return reformat;
    }
}
