package com.example.vendor.vendorInbox;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.vendor.R;
import java.util.ArrayList;
import java.util.List;

public class VendorInboxFragment extends Fragment {

    private RecyclerView recyclerView;
    private MessageAdapter messageAdapter;

    public VendorInboxFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_vendor_inbox, container, false);

        recyclerView = view.findViewById(R.id.rvMessageList);

        // Set up RecyclerView with a LinearLayoutManager
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Set up adapter with sample data
        messageAdapter = new MessageAdapter(getMessages());
        recyclerView.setAdapter(messageAdapter);

        return view;
    }

    // Sample method to generate some dummy data
    private List<Message> getMessages() {
        List<Message> messages = new ArrayList<>();
        messages.add(new Message("Juan Reyes", "Hi, Good Evening po", "14:59", R.drawable.ic_profile));
        messages.add(new Message("Kean Cipriano", "Still available?", "15:01", R.drawable.ic_profile));
        messages.add(new Message("Ana Delos Santos", "Highly recommend! Love it!", "20:34", R.drawable.ic_profile));
        messages.add(new Message("Albert Alonte", "Accepting gcash payment?", "23:15", R.drawable.ic_profile));
        return messages;
    }
}
