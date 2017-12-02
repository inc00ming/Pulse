package com.company;

import java.util.ArrayList;

/**
 * Created by furkan on 30.11.2017.
 */
public class Course {

    private String courseCode, courseName;
    private int courseCredit;
    private static ArrayList<Course> allCourses;


    public Course(String courseCode, String courseName, int courseCredit){
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseCredit = courseCredit;
    }

    public String getCourseCode(){
        return courseCode;
    }

    public String getCourseName(){
        return courseName;
    }

    public int getCourseCredit(){
        return courseCredit;
    }

    public static void setAllCourses(){
        allCourses = new ArrayList<Course>();
        allCourses.add(new Course("None", "None", 0));
        allCourses.add(new Course("LAW 101", "Hukuka Giriş", 4));
        allCourses.add(new Course("LAW 105", "Medeni Hukuka Giriş ve Kişiler Hukuku", 4));
        allCourses.add(new Course("LAW 107","Anayasa Hukuku (Genel İlkeler)",3));
        allCourses.add(new Course("ENG 121","Temel İngilizce I", 4));
        allCourses.add(new Course("HIST 201","Uygarlık Tarihi", 3));
        allCourses.add(new Course("HIST 101","Atatürk İlkeleri ve İnkılâp Tarihi I", 2));
        allCourses.add(new Course("IKT 105","Mikro Ekonomi", 2));
        allCourses.add(new Course("LAW 104","Hukuk Tarihi ve Roma Hukuku",3));
        allCourses.add(new Course("LAW 106","Aile Hukuku",4));
        allCourses.add(new Course("LAW 108","Türk Anayasa Hukuku",3));
        allCourses.add(new Course("ENG 122","Temel İngilizce II",4));
        allCourses.add(new Course("HIST 102","Atatürk İlkeleri ve İnkılâp Tarihi II",2));
        allCourses.add(new Course("IKT 106","Makro Ekonomi",2));
        allCourses.add(new Course("LAW 211","Uluslararası Hukuk Genel İlkeler ",3));
        allCourses.add(new Course("LAW 215","Kamu Maliyesi",3));
        allCourses.add(new Course("LAW 231","Borçlar Hukuku Genel Hükümler - I",3));
        allCourses.add(new Course("LAW 233","İdare Hukuku - I",4));
        allCourses.add(new Course("LAW 235","Ceza Hukuku Genel Hükümler - I",3));
        allCourses.add(new Course("ENG 221","Temel İngilizce III",3));
        allCourses.add(new Course("LAW 210","Kamu Hürriyetleri",3));
        allCourses.add(new Course("LAW 218","Uluslararası Hukuk Sorunları",3));
        allCourses.add(new Course("LAW 232","Borçlar Hukuku Genel Hükümler - II",4));
        allCourses.add(new Course("LAW 234","İdare Hukuku - II",3));
        allCourses.add(new Course("LAW 236","Ceza Hukuku Genel Hükümler- II",3));
        allCourses.add(new Course("ENG 222","Temel İngilizce IV",3));
        allCourses.add(new Course("LAW 301","Borçlar Hukuku Özel Hükümler",4));
        allCourses.add(new Course("LAW 307","Ceza Hukuku Özel Hükümler",3));
        allCourses.add(new Course("LAW 311","Ticari İşletme Hukuku",3));
        allCourses.add(new Course("LAW 315","Medeni Usul Hukuku",4));
        allCourses.add(new Course("ENG 321","Genel Akademik Beceriler I",3));
        allCourses.add(new Course("LAW 302","Eşya Hukuku",4));
        allCourses.add(new Course("LAW 308","İdari Yargı",3));
        allCourses.add(new Course("LAW 312","Şirketler Hukuku",3));
        allCourses.add(new Course("LAW 322","Vergi Hukuku",4));
        allCourses.add(new Course("ENG 322","Temel İngilizce VI",3));
        allCourses.add(new Course("LAW 403","Ceza Usul Hukuku",4));
        allCourses.add(new Course("LAW 413","İş Hukuku",4));
        allCourses.add(new Course("LAW 417","Miras Hukuku",3));
        allCourses.add(new Course("LAW 423","Genel Devlet Teorileri",3));
        allCourses.add(new Course("TURK 401","Türk Dili I",2));
        allCourses.add(new Course("LAW 408","Kıymetli Evrak Hukuku",3));
        allCourses.add(new Course("LAW 412","Uluslararası Özel Hukuk",4));
        allCourses.add(new Course("LAW 414","Sosyal Güvenlik Hukuku",2));
        allCourses.add(new Course("LAW 420","İcra ve İflas Hukuku",3));
        allCourses.add(new Course("LAW 436","Hukuk Felsefesi ve Sosyolojisi",4));
        allCourses.add(new Course("TURK 402","Türk Dili II",2));
        allCourses.add(new Course("LAW 109","Hukukta Metot",2));
        allCourses.add(new Course("LAW 334","Hukuk ve Etik",2));
        allCourses.add(new Course("LAW 221","Politika Bilimi",3));
        allCourses.add(new Course("LAW 223","Spor Hukuku",3));
        allCourses.add(new Course("LAW 225","Hukuk ve Kadın",3));
        allCourses.add(new Course("LAW 251","Hukuk İngilizcesi-I",3));
        allCourses.add(new Course("LAW 222","İletişim Hukuku",2));
        allCourses.add(new Course("LAW 224","Vatandaşlık Hukuku",2));
        allCourses.add(new Course("LAW 252","Hukuk İngilizcesi-II",2));
        allCourses.add(new Course("LAW 254","Hukuk ve Edebiyat",2));
        allCourses.add(new Course("LAW 256","Türk Parlamento Hukuku",2));
        allCourses.add(new Course("LAW 317","Stratejik Planlama",2));
        allCourses.add(new Course("LAW 321","Genel Muhasebe",2));
        allCourses.add(new Course("LAW 325","Fikri ve Sınai Haklar",2));
        allCourses.add(new Course("LAW 327","Yabancılar Hukuku",2));
        allCourses.add(new Course("LAW 323","Adli Yazışma ",2));
        allCourses.add(new Course("LAW 351","Hukuk İngilizcesi-III",2));
        allCourses.add(new Course("LAW 361","Sağlık Hukuku",2));
        allCourses.add(new Course("LAW 324","Uluslararası Tahkim Hukuku",2));
        allCourses.add(new Course("LAW 328","Eleştirel Düşünce",2));
        allCourses.add(new Course("LAW 330","Sermaye Piyasası Hukuku",2));
        allCourses.add(new Course("LAW 338","Mali Suçlar",2));
        allCourses.add(new Course("LAW 332","Avukatlık ve Noterlik Hukuku",2));
        allCourses.add(new Course("LAW 352","Hukuk İngilizcesi-IV",2));
        allCourses.add(new Course("LAW 356","Seminer",2));
        allCourses.add(new Course("LAW 429","İngilizce Çeviri",2));
        allCourses.add(new Course("LAW 431","Deniz Hukuku",2));
        allCourses.add(new Course("LAW 433","Finansman Hukuku",2));
        allCourses.add(new Course("LAW 435","Bilişim Hukuku",2));
        allCourses.add(new Course("LAW 401","Çevre Hukuku",3));
        allCourses.add(new Course("LAW 415","Anayasa Yargısı",3));
        allCourses.add(new Course("LAW 421","Kriminoloji",3));
        allCourses.add(new Course("LAW 441","Kat Mülkiyeti Hukuku",3));
        allCourses.add(new Course("LAW 219","Karşılaştırmalı Hukuk ",2));
        allCourses.add(new Course("LAW 220","Çevre Politikası",2));
        allCourses.add(new Course("LAW 261","Çocuk Hukuku",3));
        allCourses.add(new Course("LAW 424","Sigorta Hukuku",2));
        allCourses.add(new Course("LAW 426","Adli Tıp",2));
        allCourses.add(new Course("LAW 428","Siyasi Partiler",2));
        allCourses.add(new Course("LAW 434","Avrupa Birliği Hukuku",2));
        allCourses.add(new Course("LAW 442","Tüketici Hukuku",2));
    }

    public static ArrayList<Course> getAllCourses(){
        return allCourses;
    }
    public static Course findCourse(String courseCode){
        for (Course c: allCourses) {
            if(c.getCourseCode().equals(courseCode)){
                return c;
            }
        }
        return null;
    }
}
