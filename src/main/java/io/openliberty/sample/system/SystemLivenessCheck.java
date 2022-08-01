package io.openliberty.sample.system;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;

import jakarta.enterprise.context.ApplicationScoped;

@Liveness
@ApplicationScoped
public class SystemLivenessCheck implements HealthCheck {

	@Override
	public HealthCheckResponse call() {
		MemoryMXBean memBean = ManagementFactory.getMemoryMXBean();
		long memUsed = memBean.getHeapMemoryUsage().getUsed();
		long memMax = memBean.getHeapMemoryUsage().getMax();
		
		return HealthCheckResponse.named(
				SystemResource.class.getSimpleName() + " Liveness Check")
				.status(memUsed < memMax*0.9).build();
	}

}
