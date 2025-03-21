package cn.example.server;

public class Process {
    private static int count = 0;

    public static void main(String[] args) throws Exception {
        while (true) {
            count++;
            System.out.println("Current Count: " + count);
            Thread.sleep(5000); // 5秒后打印一次
        }
    }
}


# 在 shell1 中启动
java -server -classpath /lib cn.example.server.Process

# 在 shell2 中启动（新的 JVM 进程）
java -server -classpath /lib cn.example.server.Process
