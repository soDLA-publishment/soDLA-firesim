package nvdla

class nv_large
{
  val FEATURE_DATA_TYPE_INT8 = true
  val WEIGHT_DATA_TYPE_INT8 = true
  val WEIGHT_COMPRESSION_ENABLE = false
  val WINOGRAD_ENABLE = false
  val BATCH_ENABLE = false
  val SECONDARY_MEMIF_ENABLE = true
  val SDP_LUT_ENABLE = true
  val SDP_BS_ENABLE = true
  val SDP_BN_ENABLE = true
  val SDP_EW_ENABLE = true
  val BDMA_ENABLE = false
  val RUBIK_ENABLE = false
  val RUBIK_CONTRACT_ENABLE = false
  val RUBIK_RESHAPE_ENABLE = false
  val PDP_ENABLE = true
  val CDP_ENABLE = true
  val RETIMING_ENABLE = false
  val MAC_ATOMIC_C_SIZE = 64
  val MAC_ATOMIC_K_SIZE = 32
  val MEMORY_ATOMIC_SIZE = 32
  val MAX_BATCH_SIZE = 32
  val CBUF_BANK_NUMBER = 16
  val CBUF_BANK_WIDTH = 64
  val CBUF_BANK_DEPTH = 512
  val SDP_BS_THROUGHPUT = 16
  val SDP_BN_THROUGHPUT = 16
  val SDP_EW_THROUGHPUT = 4
  val PDP_THROUGHPUT = 8
  val CDP_THROUGHPUT = 8
  val PRIMARY_MEMIF_LATENCY = 1024
  val SECONDARY_MEMIF_LATENCY = 1024
  val PRIMARY_MEMIF_MAX_BURST_LENGTH = 1
  val PRIMARY_MEMIF_WIDTH = 256
  val SECONDARY_MEMIF_MAX_BURST_LENGTH = 1
  val SECONDARY_MEMIF_WIDTH = 256
  val MEM_ADDRESS_WIDTH = 64

  val useFPGA = true
}