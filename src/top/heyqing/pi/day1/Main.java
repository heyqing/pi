package top.heyqing.pi.day1;

/**
 * ClassName:Main
 * Package:top.heyqing.pi.day1
 * Description:
 * 生产实习-1
 *
 * @Date:2025/9/1
 * @Author:Heyqing
 */
public class Main {
    /*
    常用DOS命令：cmd->D:->cd dir->cd ..->dir->cls->exit ...
     */
    public static void main(String[] args) {
        //环境测试
        envTest();
        /*
        了解JVM、JDK、JRE
        jvm：java代码核心运行环境
        jdk：java程序开发工具包，包含jre、lib等
        jre：java程序程序运行环境，包含jvm
         */
        //设置变量
        setVariable();
        //数据类型转换
        dataTypeConvert();
    }

    /**
     * 数据类型转换
     */
    private static void dataTypeConvert() {
        int a = 10;
        long b = a;
        int c = (int) b;
    }

    /**
     * 设置变量
     */
    private static void setVariable() {
        System.out.println("了解数据类型，设置变量等");
        String name = "zs";
        int age = 18;
        boolean sex = true;
        long money = 10000000000000L;
        char score = 'A';
    }

    /**
     * 环境测试
     */
    private static void envTest() {
        System.out.println("环境正常，可运行。");
    }
}
