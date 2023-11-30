package com.example.aula20.repository;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.aula20.model.Exercicios;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ExerciciosDAO_Impl implements ExerciciosDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Exercicios> __insertionAdapterOfExercicios;

  private final EntityDeletionOrUpdateAdapter<Exercicios> __deletionAdapterOfExercicios;

  private final EntityDeletionOrUpdateAdapter<Exercicios> __updateAdapterOfExercicios;

  public ExerciciosDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfExercicios = new EntityInsertionAdapter<Exercicios>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `exercicios` (`id`,`professor`,`nome`,`Series`,`Dias_da_semana`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Exercicios value) {
        stmt.bindLong(1, value.getId());
        if (value.getProfessor() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getProfessor());
        }
        if (value.getNome() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getNome());
        }
        if (value.getSeries() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getSeries());
        }
        if (value.getDias_da_semana() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDias_da_semana());
        }
      }
    };
    this.__deletionAdapterOfExercicios = new EntityDeletionOrUpdateAdapter<Exercicios>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `exercicios` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Exercicios value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfExercicios = new EntityDeletionOrUpdateAdapter<Exercicios>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `exercicios` SET `id` = ?,`professor` = ?,`nome` = ?,`Series` = ?,`Dias_da_semana` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Exercicios value) {
        stmt.bindLong(1, value.getId());
        if (value.getProfessor() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getProfessor());
        }
        if (value.getNome() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getNome());
        }
        if (value.getSeries() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getSeries());
        }
        if (value.getDias_da_semana() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDias_da_semana());
        }
        stmt.bindLong(6, value.getId());
      }
    };
  }

  @Override
  public long salvarExercicio(final Exercicios exercicios) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfExercicios.insertAndReturnId(exercicios);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deletarExercicio(final Exercicios exercicios) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfExercicios.handle(exercicios);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void atualizarExercicio(final Exercicios exercicios) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfExercicios.handle(exercicios);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Exercicios getExercicio(final int id) {
    final String _sql = "SELECT * FROM exercicios WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfProfessor = CursorUtil.getColumnIndexOrThrow(_cursor, "professor");
      final int _cursorIndexOfNome = CursorUtil.getColumnIndexOrThrow(_cursor, "nome");
      final int _cursorIndexOfSeries = CursorUtil.getColumnIndexOrThrow(_cursor, "Series");
      final int _cursorIndexOfDiasDaSemana = CursorUtil.getColumnIndexOrThrow(_cursor, "Dias_da_semana");
      final Exercicios _result;
      if(_cursor.moveToFirst()) {
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpProfessor;
        if (_cursor.isNull(_cursorIndexOfProfessor)) {
          _tmpProfessor = null;
        } else {
          _tmpProfessor = _cursor.getString(_cursorIndexOfProfessor);
        }
        final String _tmpNome;
        if (_cursor.isNull(_cursorIndexOfNome)) {
          _tmpNome = null;
        } else {
          _tmpNome = _cursor.getString(_cursorIndexOfNome);
        }
        final String _tmpSeries;
        if (_cursor.isNull(_cursorIndexOfSeries)) {
          _tmpSeries = null;
        } else {
          _tmpSeries = _cursor.getString(_cursorIndexOfSeries);
        }
        final String _tmpDias_da_semana;
        if (_cursor.isNull(_cursorIndexOfDiasDaSemana)) {
          _tmpDias_da_semana = null;
        } else {
          _tmpDias_da_semana = _cursor.getString(_cursorIndexOfDiasDaSemana);
        }
        _result = new Exercicios(_tmpId,_tmpProfessor,_tmpNome,_tmpSeries,_tmpDias_da_semana);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Exercicios> getExercicios() {
    final String _sql = "SELECT * FROM exercicios";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfProfessor = CursorUtil.getColumnIndexOrThrow(_cursor, "professor");
      final int _cursorIndexOfNome = CursorUtil.getColumnIndexOrThrow(_cursor, "nome");
      final int _cursorIndexOfSeries = CursorUtil.getColumnIndexOrThrow(_cursor, "Series");
      final int _cursorIndexOfDiasDaSemana = CursorUtil.getColumnIndexOrThrow(_cursor, "Dias_da_semana");
      final List<Exercicios> _result = new ArrayList<Exercicios>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Exercicios _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpProfessor;
        if (_cursor.isNull(_cursorIndexOfProfessor)) {
          _tmpProfessor = null;
        } else {
          _tmpProfessor = _cursor.getString(_cursorIndexOfProfessor);
        }
        final String _tmpNome;
        if (_cursor.isNull(_cursorIndexOfNome)) {
          _tmpNome = null;
        } else {
          _tmpNome = _cursor.getString(_cursorIndexOfNome);
        }
        final String _tmpSeries;
        if (_cursor.isNull(_cursorIndexOfSeries)) {
          _tmpSeries = null;
        } else {
          _tmpSeries = _cursor.getString(_cursorIndexOfSeries);
        }
        final String _tmpDias_da_semana;
        if (_cursor.isNull(_cursorIndexOfDiasDaSemana)) {
          _tmpDias_da_semana = null;
        } else {
          _tmpDias_da_semana = _cursor.getString(_cursorIndexOfDiasDaSemana);
        }
        _item = new Exercicios(_tmpId,_tmpProfessor,_tmpNome,_tmpSeries,_tmpDias_da_semana);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
