public class BytesConverter {
    public static void main(String[] args) {
        long totalBytes = 100;

        long gigaBytes = totalBytes / (1024 * 1024 * 1024);
        long megaBytes = (totalBytes - gigaBytes * (1024 * 1024 * 1024)) / (1024 * 1024);
        long kiloBytes = (totalBytes - gigaBytes * (1024 * 1024 * 1024) - megaBytes * (1024 * 1024)) / 1024;
        long bytes = (totalBytes - gigaBytes * (1024 * 1024 * 1024) - megaBytes * (1024 * 1024) - kiloBytes * 1024);
        System.out.println(gigaBytes + " GB, " + megaBytes + " MB, "
                + kiloBytes + " KB, " + bytes + " B");
    }
}
