package com.project.mobile.dailydraft.ui.catatan;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.project.mobile.dailydraft.Adapter;
import com.project.mobile.dailydraft.R;
import com.project.mobile.dailydraft.SqliteHelper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class CatatanFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_catatan, container, false);
        final TextView textView = root.findViewById(R.id.list_view);

    }
}
