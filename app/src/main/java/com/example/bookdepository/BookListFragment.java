package com.example.bookdepository;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BookListFragment extends Fragment {
    private RecyclerView mBookRecyclerView;
    private class BookHolder extends RecyclerView.ViewHolder {
        public TextView mTitleTextView;
        public BookHolder(View itemView) {
            super(itemView);
            mTitleTextView = (TextView) itemView;
        }
    }
    private class BookAdapter extends RecyclerView.Adapter<BookHolder> {
        private List<Book> mBooks;
        public BookAdapter(List<Book> books) {
            mBooks = books;
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_book_list, container,
                false);
        mBookRecyclerView = (RecyclerView) view
                .findViewById(R.id.book_recycler_view);
        mBookRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;
    }

}
