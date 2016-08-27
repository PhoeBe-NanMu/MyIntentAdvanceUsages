package com.example.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by LeiYang on 2016/8/28 0028.
 */

public class Person implements Parcelable {
    private String name;
    private  int age;
    private String sex;

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeInt(age);
        parcel.writeString(sex);

    }

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            Person person = new Person();
            person.name = in.readString();
            person.age = in.readInt();
            person.sex = in.readString();
            return person;

        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

}
