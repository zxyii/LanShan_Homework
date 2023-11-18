package Homework3_1;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleGame {
   private  ArrayList<User> users = new ArrayList<>();
   private Scanner sc = new Scanner(System.in);



   public void start(){
       while (true) {
           System.out.println("————初始界面————");
           System.out.println("欢迎进入这个莫名其妙的游戏");
           System.out.println("请输入以下指令序号： ");
           System.out.println("1、用户登录");
           System.out.println("2、用户注册");
           System.out.println("3、退出游戏");
           int operator = sc.nextInt();
           switch (operator) {
               case 1:
                   LoginUsers();
                   break;
               case 2:
                   CreatUsers();
                   break;
               case 3:
                   System.out.println("请多包容~");
                   break;
               default:
                   System.out.println("操作错误,请按提示操作哦");

           }
       }
   }
   private void CreatUsers(){
       User user = new User();
       System.out.println("请输入您的游戏名称：");
       String name = sc.next();
       user.setGameName(name);
       System.out.println("请设置登陆密码: ");

       int password = sc.nextInt();
       user.setpassword(password);

       users.add(user);
       System.out.println("用户创建成功ovo!" + user.getGameName() + "祝您体验愉快..");
   }
   private User getUser(String gamename){
       for (int i = 0; i < users.size(); i++) {
           User user =  users.get(i);
           if(user.getGameName().equals(gamename)){
               return user;
           }
       }
       return null;
   }

   public void LoginUsers(){
       System.out.println("————登陆界面————");
       if(users.size() == 0){
           System.out.println("请先注册哦");
           return;
       }
      while (true) {
           System.out.println("请输入您的游戏名称： ");
           String gamename = sc.next();
           User user = getUser(gamename);
           if (user == null) {
               System.out.println("请检查您的输入是否正确");
           }else {
               while(true) {
                   System.out.println("请输入登陆密码： ");
                   int password = sc.nextInt();
                   if (user.getpassword() == password) {
                       System.out.println(gamename + "登陆成功");
                       Function();
                       break;
                   } else {
                       System.out.println("请确认您输入的密码无误");
                   }
               }
          }
         break;
       }
   }


   public void Function(){
       while (true) {
           System.out.println("————功能界面————");
           System.out.println("1、冒险");
           System.out.println("2、竞技场");
           System.out.println("后续功能敬请期待");
           System.out.println("请输入想进行的的功能： ");
           int command = sc.nextInt();
           switch (command) {
               case 1:
                  Adventure adventure = new Adventure();
                  adventure.ChooseCharacter();
                   break;
               case 2:
                   System.out.println("暂时没时间做~");
                   break;
               case 3:
                   System.out.println("暂时没时间做~");
                   break;
           }
           break;
       }
   }
}
