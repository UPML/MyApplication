package kagudkov.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class RelativeFragment extends Fragment  implements INavigationListener{

    private Button mPrevButton;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.relative_layout, container, false);
        mPrevButton = (Button) v.findViewById(R.id.relative_layout_prev_button);
        mPrevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onPrevClick();
            }
        });

        return v;

    }

    @Override
    public void onNextClick() {
        
    }

    @Override
    public void onPrevClick() {
        LinearFragment linearFragment = new LinearFragment();
        getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, linearFragment).commit();
    }
}