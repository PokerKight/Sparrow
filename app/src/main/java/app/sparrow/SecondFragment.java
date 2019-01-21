package app.sparrow;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SecondFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        RecyclerView secondRecycler = (RecyclerView)inflater.inflate(
                R.layout.fragment_second, container, false);

        String[] secondNames = new String[Second.seconds.length];
        for (int i = 0; i < secondNames.length; i++){
            secondNames[i] = Second.seconds[i].getName();
        }

        int[] secondImages = new int[Second.seconds.length];
        for (int i = 0; i < secondImages.length; i++){
            secondImages[i] = Second.seconds[i].getImageResourceId();
        }

        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(secondNames, secondImages);
        secondRecycler.setAdapter(adapter);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
        secondRecycler.setLayoutManager(layoutManager);
        return secondRecycler;
    }

}
