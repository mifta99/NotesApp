package com.mifta.project.id.consumerapp.db;

import android.net.Uri;
import android.provider.BaseColumns;

public class DatabaseContract {
    public static final String AUTHORITY = "com.mifta.project.id.dicodingnotesapp";
    private static final String SCHEME = "content";


    private DatabaseContract(){}

    public static final class NoteColumns implements BaseColumns {
        public static String TABLE_NAME = "Note";
        public static String TITLE = "title";
        public static String DESCRIPTION = "description";
        public static String DATE = "date";

        public static final Uri CONTENT_URI = new Uri.Builder().scheme(SCHEME)
                .authority(AUTHORITY)
                .appendPath(TABLE_NAME)
                .build();
    }
}
