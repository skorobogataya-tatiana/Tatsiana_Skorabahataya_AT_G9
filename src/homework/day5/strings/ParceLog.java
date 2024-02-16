package homework.day5.strings;

public class ParceLog {

    public static void checkLog(String log) {
        String regex = "\\d{3}.\\d{3}.\\d{3}.\\d{1}";
        int granted = 0;
        int denied = 0;
        String ip = null;
        String[] splitLogs = log.split("\n");

        for (String line : splitLogs) {
            if (line.contains(regex)) {
                String[] partsOfLine = line.trim().split("\\s+");
                ip = partsOfLine[1];
                String status = partsOfLine[2];
                if (status.equals("granted")) {
                    granted++;
                } else if (status.equals("denied")) {
                    denied++;
                }
            }

        }
        System.out.println("Ip " + ip + ": ok - " + granted + ", failed - " + denied);

    }
}
