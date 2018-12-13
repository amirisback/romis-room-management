package com.frogobox.romis.User.Object;

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * Romis
 * Copyright (C) 19/07/2018.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Line     : bullbee117
 * Phone    : 081357108568
 * Majors   : D3 Teknik Informatika 2016
 * Campus   : Telkom University
 * -----------------------------------------
 * id.amirisback.frogobox
 */
public class UserMeetingObject {

    private String namaRuangan, agenda, namaUser, waktuAwal, waktuAkhir, noTelp;

    public UserMeetingObject(String namaRuangan, String agenda, String namaUser, String waktuAwal,
                             String waktuAkhir, String noTelp) {
        this.namaRuangan = namaRuangan;
        this.agenda = agenda;
        this.namaUser = namaUser;
        this.waktuAwal = waktuAwal;
        this.waktuAkhir = waktuAkhir;
        this.noTelp = noTelp;
    }

    public String getNamaRuangan() {
        return namaRuangan;
    }

    public void setNamaRuangan(String namaRuangan) {
        this.namaRuangan = namaRuangan;
    }

    public String getAgenda() {
        return agenda;
    }

    public void setAgenda(String agenda) {
        this.agenda = agenda;
    }

    public String getNamaUser() {
        return namaUser;
    }

    public void setNamaUser(String namaUser) {
        this.namaUser = namaUser;
    }

    public String getWaktuAwal() {
        return waktuAwal;
    }

    public void setWaktuAwal(String waktuAwal) {
        this.waktuAwal = waktuAwal;
    }

    public String getWaktuAkhir() {
        return waktuAkhir;
    }

    public void setWaktuAkhir(String waktuAkhir) {
        this.waktuAkhir = waktuAkhir;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }
}
