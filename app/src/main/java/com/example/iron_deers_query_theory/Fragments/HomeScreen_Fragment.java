package com.example.iron_deers_query_theory.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.iron_deers_query_theory.R;

/*
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeScreen_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeScreen_Fragment extends Fragment
{
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    // TODO: Rename and change types of parameters

    public HomeScreen_Fragment()
    {
        // Required empty public constructor
    }

    /*
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeScreen_Fragment.
     */
    // TODO: Rename and change types and number of parameters
    //public static HomeScreen_Fragment newInstance(String param1, String param2) {
        //HomeScreen_Fragment fragment = new HomeScreen_Fragment();
        //Bundle args = new Bundle();
        //args.putString(ARG_PARAM1, param1);
        //args.putString(ARG_PARAM2, param2);
        //fragment.setArguments(args);
        //return fragment;
    //}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //if (getArguments() != null) {}
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_screen_, container, false);
    }
}