package com.example.bookdepository;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class BookFragment extends Fragment {
    private Book mBook;
    private EditText mTitleField;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBook = new Book();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup
            container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_book, container,
                false);
        mTitleField = (EditText)v.findViewById(R.id.book_title);
        mTitleField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(
                    CharSequence s, int start, int count, int after) {
// Здесь намеренно оставлено пустое место
            }
            @Override
            public void onTextChanged(
                    CharSequence s, int start, int before, int count) {
                mBook.setTitle(s.toString());
            }
            @Override
            public void afterTextChanged(Editable c) {
// И здесь тоже
            }
        });
        return v;
    }
}
