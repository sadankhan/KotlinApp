<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/my_color_1"
    tools:context=".MainActivity">

    <ImageView
        android:id="@+id/imgLogo"
        android:layout_width="90dp"
        android:layout_height="90dp"
        android:src="@drawable/app_logo"
        android:layout_centerHorizontal="true"
        android:layout_marginTop="50dp"/>

    <TextView
        android:id="@+id/tvAppName"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/learn_kotlin"
        android:layout_below="@+id/imgLogo"
        android:layout_centerHorizontal="true"
        android:textSize="30sp"
        android:padding="20dp"
        android:textStyle="bold"
        android:fontFamily="monospace"
        android:textColor="@color/colorPrimaryDark" />

    <EditText
        android:id="@+id/etUserName"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_below="@id/tvAppName"
        android:layout_marginLeft="30dp"
        android:layout_marginRight="30dp"
        android:drawableLeft="@drawable/username"
        android:hint="@string/username"
        android:inputType="text"
        android:maxLines="1"
        android:outlineAmbientShadowColor="@color/my_color_1"
        android:padding="12dp"
        android:textColorHint="@color/colorPrimaryDark"
        android:background="@color/white"
        android:cursorVisible="true"
        />

    <EditText
        android:id="@+id/etPassword"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_below="@id/etUserName"
        android:layout_marginLeft="30dp"
        android:layout_marginRight="30dp"
        android:drawableLeft="@drawable/password"
        android:hint="@string/password"
        android:inputType="textPassword"
        android:maxLines="1"
        android:outlineAmbientShadowColor="@color/my_color_2"
      