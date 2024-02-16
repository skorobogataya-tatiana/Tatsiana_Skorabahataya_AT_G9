package homework.day5.strings;

public class ParceLog {

    public static void checkLog(String logText) {
        String[] logLines = logText.split("\n");
        String regex = "\\d{3}.\\d{3}.\\d{3}.\\d{1}";
        String[] ipAddressesArray = new String[logLines.length]; //here I will keep ip addresses
        int ipAddressCount = 0;

        for(String line : logLines) {
            if(line.matches(".*" + regex + ".*")) {
                String[] words = line.split(" ");
                String ip = words[1];
                boolean isUnique = true;
                for (int i = 0; i <ipAddressCount; i++) {
                    if(ip.equals(ipAddressesArray[i])) {
                        isUnique = false;
                        break;
                    }
                }
                if(isUnique) {
                    ipAddressesArray[ipAddressCount] = ip;
                    ipAddressCount++;
                }
            }
        }

        for(int i = 0; i < ipAddressCount; i++) {
            String ip = ipAddressesArray[i];
            int okCount = 0;
            int failedCount = 0;
            for(String line : logLines) {
                if(line.contains(ip)) {
                    String[] parts = line.split(" ");
                    String status = parts[2];
                    if(status.equals("granted")) {
                        okCount++;
                    } else if(status.equals("denied")) {
                        failedCount++;
                    }
                }
            }
            System.out.println("ip " + ip + ": ok - " + okCount + ", failed - " + failedCount);
        }

    }

}
