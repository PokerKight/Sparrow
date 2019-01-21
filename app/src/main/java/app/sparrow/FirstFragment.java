package app.sparrow;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FirstFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        RecyclerView firstRecycler = (RecyclerView)inflater.inflate(
                R.layout.fragment_first, container, false);

        String[] firstNames = new String[First.firsts.length];
        for (int i = 0; i < firstNames.length; i++){
            firstNames[i] = First.firsts[i].getName();
        }

        int[] firstImages = new int[First.firsts.length];
        for (int i = 0; i < firstImages.length; i++){
            firstImages[i] = First.firsts[i].getImageResourceId();
        }

        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(firstNames, firstImages);
        firstRecycler.setAdapter(adapter);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
        firstRecycler.setLayoutManager(layoutManager);
        return firstRecycler;
    }

}
