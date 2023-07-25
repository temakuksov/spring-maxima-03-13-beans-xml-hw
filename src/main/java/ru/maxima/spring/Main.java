package ru.maxima.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    // Создать лист бинов в applicationContext.xml (надо погуглить).
    // Выводить в методе playMusic() все песни, которые играют
    // на всех радиостанциях.
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
             new ClassPathXmlApplicationContext("ApplicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println();
        musicPlayer.playMusic();

    }
}
