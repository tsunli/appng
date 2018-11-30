package org.appng.core.service;

import java.io.File;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;

import org.appng.api.Platform;
import org.appng.api.model.Properties;
import org.springframework.stereotype.Service;

@Service
public class PlatformProperties implements Properties {

	private Properties properties;

	void initialize(Properties properties) {
		this.properties = properties;
	}

	Properties getProperties() {
		return properties;
	}

	public List<String> getList(String name, String defaultValue, String delimiter) {
		return properties.getList(name, defaultValue, delimiter);
	}

	public List<String> getList(String name, String delimiter) {
		return properties.getList(name, delimiter);
	}

	public String getString(String name) {
		return properties.getString(name);
	}

	public String getString(String name, String defaultValue) {
		return properties.getString(name, defaultValue);
	}

	public Boolean getBoolean(String name) {
		return properties.getBoolean(name);
	}

	public Boolean getBoolean(String name, Boolean defaultValue) {
		return properties.getBoolean(name, defaultValue);
	}

	public Integer getInteger(String name) {
		return properties.getInteger(name);
	}

	public Integer getInteger(String name, Integer defaultValue) {
		return properties.getInteger(name, defaultValue);
	}

	public Float getFloat(String name) {
		return properties.getFloat(name);
	}

	public Float getFloat(String name, Float defaultValue) {
		return properties.getFloat(name, defaultValue);
	}

	public Double getDouble(String name) {
		return properties.getDouble(name);
	}

	public Double getDouble(String name, Double defaultValue) {
		return properties.getDouble(name, defaultValue);
	}

	public String getClob(String name) {
		return properties.getClob(name);
	}

	public String getClob(String name, String defaultValue) {
		return properties.getClob(name, defaultValue);
	}

	public byte[] getBlob(String name) {
		return properties.getBlob(name);
	}

	public Set<String> getPropertyNames() {
		return properties.getPropertyNames();
	}

	public boolean propertyExists(String name) {
		return properties.propertyExists(name);
	}

	public java.util.Properties getPlainProperties() {
		return properties.getPlainProperties();
	}

	public java.util.Properties getProperties(String name) {
		return properties.getProperties(name);
	}

	public String getDescriptionFor(String name) {
		return properties.getDescriptionFor(name);
	}

	public File getCacheConfig() {
		return getAbsoluteFile(Platform.Property.EHCACHE_CONFIG);
	}

	public File getUploadDir() {
		return getAbsoluteFile(Platform.Property.UPLOAD_DIR);
	}

	public File getApplicationDir() {
		return getAbsoluteFile(Platform.Property.APPLICATION_DIR);
	}

	public File getRepositoryRootFolder() {
		return getAbsoluteFile(Platform.Property.REPOSITORY_PATH);
	}

	private File getAbsoluteFile(String folder) {
		return Paths.get(getString(Platform.Property.APPNG_DATA), getString(folder)).normalize().toFile();
	}

}