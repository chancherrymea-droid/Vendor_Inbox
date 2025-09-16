package com.example.vendor.vendorInbox;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.vendor.R;
import java.util.List;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MessageViewHolder> {

    private List<Message> messages;

    public MessageAdapter(List<Message> messages) {
        this.messages = messages;
    }

    @Override
    public MessageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_message, parent, false);
        return new MessageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MessageViewHolder holder, int position) {
        Message message = messages.get(position);
        holder.nameTextView.setText(message.getName());
        holder.messageTextView.setText(message.getMessage());
        holder.timeTextView.setText(message.getTime());
        holder.profileImageView.setImageResource(message.getProfileImageResId());
    }

    @Override
    public int getItemCount() {
        return messages.size();
    }

    public static class MessageViewHolder extends RecyclerView.ViewHolder {
        public TextView nameTextView;
        public TextView messageTextView;
        public TextView timeTextView;
        public ImageView profileImageView;

        public MessageViewHolder(View view) {
            super(view);
            nameTextView = view.findViewById(R.id.name);
            messageTextView = view.findViewById(R.id.message);
            timeTextView = view.findViewById(R.id.time);
            profileImageView = view.findViewById(R.id.profileImage);
        }
    }
}
