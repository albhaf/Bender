package eu.albhaf.bender;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import eu.albhaf.bender.databinding.ViewFrobnicatorBinding;

public class FrobnicatorAdapter extends RecyclerView.Adapter<FrobnicatorAdapter.BindingHolder> {

  private final LayoutInflater inflater;

  public FrobnicatorAdapter(Context context) {
    this.inflater = LayoutInflater.from(context);
  }

  @Override public BindingHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    return new BindingHolder(inflater.inflate(R.layout.view_frobnicator, parent, false));
  }

  @Override public void onBindViewHolder(BindingHolder holder, int position) {
    if (position % 3 == 0) {
      holder.binding.setViewmodel(new Fizzer());
    } else if (position % 2 == 0) {
      holder.binding.setViewmodel(new Bazzer());
    } else {
      holder.binding.setViewmodel(new Buzzer());
    }
  }

  @Override public int getItemCount() {
    return 100;
  }

  class BindingHolder extends RecyclerView.ViewHolder {
    final ViewFrobnicatorBinding binding;

    public BindingHolder(View itemView) {
      super(itemView);
      binding = DataBindingUtil.bind(itemView);
    }
  }
}
