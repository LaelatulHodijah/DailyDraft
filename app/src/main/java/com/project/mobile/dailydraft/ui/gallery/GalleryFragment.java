package com.project.mobile.dailydraft.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.project.mobile.dailydraft.R;
import com.project.mobile.dailydraft.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {

private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_todolist, container, false);
        final TextView textView = root.findViewById(R.id.text_todolist);
        return root;
    }
}