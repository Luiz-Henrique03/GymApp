package com.example.aula20.repository;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.aula20.model.Professor;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ProfessorDAO_Impl implements ProfessorDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Professor> __insertionAdapterOfProfessor;

  private final EntityDeletionOrUpdateAdapter<Professor> __deletionAdapterOfProfessor;

  private final EntityDeletionOrUpdateAdapter<Professor> __updateAdapterOfProfessor;

  public ProfessorDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfProfessor = new EntityInsertionAdapter<Professor>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `professores` (`id`,`nome`,`Email`,`Senha`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Professor value) {
        stmt.bindLong(1, value.getId());
        if (value.getNome() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNome());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getEmail());
        }
        if (value.getSenha() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getSenha());
        }
      }
    };
    this.__deletionAdapterOfProfessor = new EntityDeletionOrUpdateAdapter<Professor>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `professores` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Professor value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfProfessor = new EntityDeletionOrUpdateAdapter<Professor>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `professores` SET `id` = ?,`nome` = ?,`Email` = ?,`Senha` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Professor value) {
        stmt.bindLong(1, value.getId());
        if (value.getNome() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNome());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getEmail());
        }
        if (value.getSenha() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getSenha());
        }
        stmt.bindLong(5, value.getId());
      }
    };
  }

  @Override
  public long salvarProfessor(final Professor professor) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfProfessor.insertAndReturnId(professor);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deletarProfessor(final Professor professor) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfProfessor.handle(professor);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void atualizarProfessor(final Professor professor) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfProfessor.handle(professor);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Professor getProfessor(final int id) {
    final String _sql = "SELECT * FROM professores WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfNome = CursorUtil.getColumnIndexOrThrow(_cursor, "nome");
      final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "Email");
      final int _cursorIndexOfSenha = CursorUtil.getColumnIndexOrThrow(_cursor, "Senha");
      final Professor _result;
      if(_cursor.moveToFirst()) {
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpNome;
        if (_cursor.isNull(_cursorIndexOfNome)) {
          _tmpNome = null;
        } else {
          _tmpNome = _cursor.getString(_cursorIndexOfNome);
        }
        final String _tmpEmail;
        if (_cursor.isNull(_cursorIndexOfEmail)) {
          _tmpEmail = null;
        } else {
          _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
        }
        final String _tmpSenha;
        if (_cursor.isNull(_cursorIndexOfSenha)) {
          _tmpSenha = null;
        } else {
          _tmpSenha = _cursor.getString(_cursorIndexOfSenha);
        }
        _result = new Professor(_tmpId,_tmpNome,_tmpEmail,_tmpSenha);
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
  public List<Professor> getProfessores() {
    final String _sql = "SELECT * FROM professores";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfNome = CursorUtil.getColumnIndexOrThrow(_cursor, "nome");
      final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "Email");
      final int _cursorIndexOfSenha = CursorUtil.getColumnIndexOrThrow(_cursor, "Senha");
      final List<Professor> _result = new ArrayList<Professor>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Professor _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpNome;
        if (_cursor.isNull(_cursorIndexOfNome)) {
          _tmpNome = null;
        } else {
          _tmpNome = _cursor.getString(_cursorIndexOfNome);
        }
        final String _tmpEmail;
        if (_cursor.isNull(_cursorIndexOfEmail)) {
          _tmpEmail = null;
        } else {
          _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
        }
        final String _tmpSenha;
        if (_cursor.isNull(_cursorIndexOfSenha)) {
          _tmpSenha = null;
        } else {
          _tmpSenha = _cursor.getString(_cursorIndexOfSenha);
        }
        _item = new Professor(_tmpId,_tmpNome,_tmpEmail,_tmpSenha);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Professor getProfessorPorNome(final String nome) {
    final String _sql = "SELECT * FROM professores WHERE nome = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (nome == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, nome);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfNome = CursorUtil.getColumnIndexOrThrow(_cursor, "nome");
      final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "Email");
      final int _cursorIndexOfSenha = CursorUtil.getColumnIndexOrThrow(_cursor, "Senha");
      final Professor _result;
      if(_cursor.moveToFirst()) {
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpNome;
        if (_cursor.isNull(_cursorIndexOfNome)) {
          _tmpNome = null;
        } else {
          _tmpNome = _cursor.getString(_cursorIndexOfNome);
        }
        final String _tmpEmail;
        if (_cursor.isNull(_cursorIndexOfEmail)) {
          _tmpEmail = null;
        } else {
          _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
        }
        final String _tmpSenha;
        if (_cursor.isNull(_cursorIndexOfSenha)) {
          _tmpSenha = null;
        } else {
          _tmpSenha = _cursor.getString(_cursorIndexOfSenha);
        }
        _result = new Professor(_tmpId,_tmpNome,_tmpEmail,_tmpSenha);
      } else {
        _result = null;
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
