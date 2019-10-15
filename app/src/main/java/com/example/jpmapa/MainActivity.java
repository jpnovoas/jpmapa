package com.example.jpmapa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap Maps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    public void onMapReady(GoogleMap googleMap) {
        Maps = googleMap;

        //Añadir marcador en El Salvador y mover la cámara.
        LatLng nuevayork = new LatLng(40.6643, -73.9385);
        Maps.addMarker(new MarkerOptions().position(nuevayork).title("Nueva York"));
        Maps.moveCamera(CameraUpdateFactory.newLatLng(nuevayork));
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}