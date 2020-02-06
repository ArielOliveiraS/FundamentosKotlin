package com.example.myapplication.funcoes;

import java.util.ArrayList;

import kotlin.collections.CollectionsKt;

public class ChamandoFuncaoKotlin {

    public static void main(String[] args) {
        ArrayList<String> list = CollectionsKt.arrayListOf("Joao", "Maria", "Pedro");
        System.out.println(SegundoElementoListKt.secondOrNull(list));
    }
}
