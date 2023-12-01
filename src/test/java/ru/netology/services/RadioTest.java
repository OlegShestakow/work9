package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class RadioTest {
    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        radio.setIncreaseVolume(59);
        int expected = 60;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetIncreaseVolumeAboveMax(){
        Radio radio = new Radio();
        radio.setIncreaseVolume(120);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetIncreaseVolumeMaxLimit(){
        Radio radio = new Radio();
        radio.setIncreaseVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldSetIncreaseVolumeMinLimit(){
        Radio radio = new Radio();
        radio.setIncreaseVolume(0);
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected , actual);
    }
    @Test
    public void shouldSetIncreaseVolumeAboutMaxLimit(){
        Radio radio = new Radio();
        radio.setIncreaseVolume(98);
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetIncreaseVolumeNegativeNumber(){
        Radio radio = new Radio();
        radio.setIncreaseVolume(-5);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetReduceVolumeMinLimit(){
        Radio radio = new Radio();
        radio.reduceVolume(1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetReduceVolumeNotNegativeNumber(){
        Radio radio = new Radio();
        radio.reduceVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldSetReduceVolume(){
        Radio radio = new Radio();
        radio.reduceVolume(20);
        int expected = 19;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected , actual);
    }
    @Test
    public void shouldSetReduceVolumeMaxLimit(){
        Radio radio = new Radio();
        radio.reduceVolume(100);
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected ,actual);
    }
    @Test
    public void shouldSetReduceVolumeAboveMax(){
        Radio radio = new Radio();
        radio.reduceVolume(115);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseStationMaxLimit(){
        Radio radio = new Radio();
        radio.setIncreaseStation(9);
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetIncreaseStation(){
        Radio radio = new Radio();
        radio.setIncreaseStation(3);
        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected , actual);
    }

    @Test
    public void shouldSetIncreaseStationAboutMinLimit(){
        Radio radio = new Radio();
        radio.setIncreaseStation(0);
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetIncreaseStationAboutMaxLimit(){
        Radio radio = new Radio();
        radio.setIncreaseStation(7);
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetIncreaseStationNotNegativeNumber(){
        Radio radio = new Radio();
        radio.setIncreaseStation(-5);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetReduceStation(){
        Radio radio = new Radio();
        radio.reduceStation(7);
        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected , actual);
    }
    @Test
    public void shouldSetReduceStationMinLimit(){
        Radio radio = new Radio();
        radio.reduceStation(1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetReduceStationNotNegativeNumber(){
        Radio radio = new Radio();
        radio.reduceStation(0);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldReduceStationAboutMax(){
        Radio radio = new Radio();
        radio.reduceStation(9);
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldReduceMaxLimit(){
        Radio radio = new Radio();
        radio.reduceStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }
}