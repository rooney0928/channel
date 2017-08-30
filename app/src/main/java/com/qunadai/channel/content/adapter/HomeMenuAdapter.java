package com.qunadai.channel.content.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.qunadai.channel.R;
import com.qunadai.channel.utils.LogU;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by wayne on 2017/8/29.
 */

public class HomeMenuAdapter extends RecyclerView.Adapter {

    private Context context;
    private OnCompatItemClickListener itemClickListener;

    private String[] texts = new String[]{"二维码", "名片", "活动链接", "产品列表", "帮助问答", "关于我们"};

    public HomeMenuAdapter(Context context) {
        this.context = context;
    }

    public void setItemClickListener(OnCompatItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (context == null) {
            context = parent.getContext();
        }
        View view = LayoutInflater.from(context).inflate(R.layout.item_home_grid, parent, false);
        MenuHolder viewHolder = new MenuHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof MenuHolder) {
            MenuHolder menuHolder = (MenuHolder) holder;
            menuHolder.setData();
        }
    }

    class MenuHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_home_text)
        TextView tv_home_text;

        public MenuHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void setData() {
            String text = texts[getAdapterPosition()];
            tv_home_text.setText("icon\n" + text);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (itemClickListener != null) {
                        itemClickListener.onItemClick(view, getAdapterPosition());
                    }
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return texts.length;
    }
}
